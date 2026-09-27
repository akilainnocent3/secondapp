#!/usr/bin/env python3
"""Read-only inventory and real DEX class-definition audit. No credentials emitted."""
import hashlib
import json
import struct
import zipfile
from pathlib import Path
ROOT = Path(__file__).resolve().parents[2]

def u32(data, offset):
    return struct.unpack_from('<I', data, offset)[0]

def dex_classes(data):
    strings_count, strings_offset = u32(data, 56), u32(data, 60)
    strings = []
    for i in range(strings_count):
        offset = u32(data, strings_offset + i * 4)
        while data[offset] & 128:
            offset += 1
        offset += 1
        strings.append(data[offset:data.index(0, offset)].decode('utf8', errors='replace'))
    type_offset = u32(data, 68)
    classes_count, classes_offset = u32(data, 96), u32(data, 100)
    for i in range(classes_count):
        class_idx = u32(data, classes_offset + i * 32)
        yield strings[u32(data, type_offset + class_idx * 4)]

def inventory():
    result = {}
    for name in ['Live.apk', 'Live_jadx', 'Live_jadx_20260927T181702Z']:
        root = ROOT / name
        files = [root] if root.is_file() else sorted(f for f in root.rglob('*') if f.is_file())
        aggregate = hashlib.sha256()
        for file in files:
            digest = hashlib.sha256(file.read_bytes()).hexdigest()
            aggregate.update((str(file.relative_to(ROOT)) + '\0' + digest + '\n').encode())
        result[name] = {'files': len(files), 'tree_sha256': aggregate.hexdigest()}
        if root.is_file():
            result[name].update(bytes=root.stat().st_size, sha256=digest)
    return result

if __name__ == '__main__':
    original = json.loads((ROOT / 'docs/input-inventory.json').read_text())
    assert inventory() == original, 'Reference material has changed!'
    print('PASS: all three original input hashes match.')
    report = {}
    with zipfile.ZipFile(ROOT / 'Live.apk') as apk:
        for name in apk.namelist():
            if name.endswith('.dex'):
                classes = list(dex_classes(apk.read(name)))
                first_party = [c for c in classes if c.startswith('Lcom/sports/live/football/tv/')]
                report[name] = {'class_count': len(classes), 'first_party_definitions': first_party}
    dest = ROOT / 'android_integration/analysis/dex-definitions.json'
    dest.parent.mkdir(parents=True, exist_ok=True)
    dest.write_text(json.dumps(report, indent=2))
    count = len(report['classes7.dex']['first_party_definitions'])
    print(f'classes7.dex defines {count} first-party classes. Detailed audit is in ignored analysis/.')
