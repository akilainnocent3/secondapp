package vh;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final short f141084a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short f141085b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final short f141086c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f141087d = 513;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final short f141088e = 514;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f141089f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f141090g = 127;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f141091h = "color";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static byte f141092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f141093j = new d(1, "android");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator<b> f141094k = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f141097c - bVar2.f141097c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f141095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte f141096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final short f141097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f141098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @k.k
        public final int f141099e;

        public b(int i10, String str, int i11) {
            this.f141098d = str;
            this.f141099e = i11;
            this.f141097c = (short) (65535 & i10);
            this.f141096b = (byte) ((i10 >> 16) & 255);
            this.f141095a = (byte) ((i10 >> 24) & 255);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final short f141100f = 288;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f141101g = 128;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f141102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f141103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f141104c = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h f141105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k f141106e;

        public c(d dVar, List<b> list) {
            this.f141103b = dVar;
            String[] strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                strArr[i10] = list.get(i10).f141098d;
            }
            this.f141105d = new h(true, strArr);
            this.f141106e = new k(list);
            this.f141102a = new e(n.f141086c, f141100f, a());
        }

        public int a() {
            return this.f141104c.a() + 288 + this.f141105d.a() + this.f141106e.b();
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f141102a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(n.j(this.f141103b.f141107a));
            char[] charArray = this.f141103b.f141108b.toCharArray();
            for (int i10 = 0; i10 < 128; i10++) {
                if (i10 < charArray.length) {
                    byteArrayOutputStream.write(n.h(charArray[i10]));
                } else {
                    byteArrayOutputStream.write(n.h((char) 0));
                }
            }
            byteArrayOutputStream.write(n.j(288));
            byteArrayOutputStream.write(n.j(0));
            byteArrayOutputStream.write(n.j(this.f141104c.a() + 288));
            byteArrayOutputStream.write(n.j(0));
            byteArrayOutputStream.write(n.j(0));
            this.f141104c.c(byteArrayOutputStream);
            this.f141105d.c(byteArrayOutputStream);
            this.f141106e.c(byteArrayOutputStream);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f141108b;

        public d(int i10, String str) {
            this.f141107a = i10;
            this.f141108b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f141109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final short f141110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f141111c;

        public e(short s10, short s11, int i10) {
            this.f141109a = s10;
            this.f141110b = s11;
            this.f141111c = i10;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(n.k(this.f141109a));
            byteArrayOutputStream.write(n.k(this.f141110b));
            byteArrayOutputStream.write(n.j(this.f141111c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final short f141112c = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final short f141113d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final short f141114e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte f141115f = 28;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f141116g = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141118b;

        public f(int i10, @k.k int i11) {
            this.f141117a = i10;
            this.f141118b = i11;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(n.k((short) 8));
            byteArrayOutputStream.write(n.k((short) 2));
            byteArrayOutputStream.write(n.j(this.f141117a));
            byteArrayOutputStream.write(n.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(n.j(this.f141118b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final short f141119e = 12;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f141120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141121b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<c> f141123d = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f141122c = new h(new String[0]);

        public g(Map<d, List<b>> map) {
            this.f141121b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, n.f141094k);
                this.f141123d.add(new c(entry.getKey(), value));
            }
            this.f141120a = new e((short) 2, (short) 12, a());
        }

        public final int a() {
            Iterator<c> it = this.f141123d.iterator();
            int iA = 0;
            while (it.hasNext()) {
                iA += it.next().a();
            }
            return this.f141122c.a() + 12 + iA;
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f141120a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(n.j(this.f141121b));
            this.f141122c.c(byteArrayOutputStream);
            Iterator<c> it = this.f141123d.iterator();
            while (it.hasNext()) {
                it.next().b(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final short f141124m = 28;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f141125n = 256;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f141126o = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f141127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f141129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f141130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f141131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<Integer> f141132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<Integer> f141133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<byte[]> f141134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<List<i>> f141135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f141136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f141137k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f141138l;

        public h(String... strArr) {
            this(false, strArr);
        }

        public int a() {
            return this.f141138l;
        }

        public final Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.f141136j ? n.m(str) : n.l(str), Collections.EMPTY_LIST);
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f141127a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(n.j(this.f141128b));
            byteArrayOutputStream.write(n.j(this.f141129c));
            byteArrayOutputStream.write(n.j(this.f141136j ? 256 : 0));
            byteArrayOutputStream.write(n.j(this.f141130d));
            byteArrayOutputStream.write(n.j(this.f141131e));
            Iterator<Integer> it = this.f141132f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(n.j(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f141133g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(n.j(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f141134h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i10 = this.f141137k;
            if (i10 > 0) {
                byteArrayOutputStream.write(new byte[i10]);
            }
            Iterator<List<i>> it4 = this.f141135i.iterator();
            while (it4.hasNext()) {
                Iterator<i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(n.j(-1));
            }
        }

        public h(boolean z10, String... strArr) {
            this.f141132f = new ArrayList();
            this.f141133g = new ArrayList();
            this.f141134h = new ArrayList();
            this.f141135i = new ArrayList();
            this.f141136j = z10;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> pairB = b(str);
                this.f141132f.add(Integer.valueOf(length));
                Object obj = pairB.first;
                length += ((byte[]) obj).length;
                this.f141134h.add((byte[]) obj);
                this.f141135i.add((List) pairB.second);
            }
            int size = 0;
            for (List<i> list : this.f141135i) {
                for (i iVar : list) {
                    this.f141132f.add(Integer.valueOf(length));
                    length += iVar.f141139a.length;
                    this.f141134h.add(iVar.f141139a);
                }
                this.f141133g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i10 = length % 4;
            int i11 = i10 == 0 ? 0 : 4 - i10;
            this.f141137k = i11;
            int size2 = this.f141134h.size();
            this.f141128b = size2;
            this.f141129c = this.f141134h.size() - strArr.length;
            boolean z11 = this.f141134h.size() - strArr.length > 0;
            if (!z11) {
                this.f141133g.clear();
                this.f141135i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f141133g.size() * 4);
            this.f141130d = size3;
            int i12 = length + i11;
            this.f141131e = z11 ? size3 + i12 : 0;
            int i13 = size3 + i12 + (z11 ? size : 0);
            this.f141138l = i13;
            this.f141127a = new e((short) 1, (short) 28, i13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f141139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f141140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f141141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f141142d;

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(n.j(this.f141140b));
            byteArrayOutputStream.write(n.j(this.f141141c));
            byteArrayOutputStream.write(n.j(this.f141142d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f141143f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final short f141144g = 84;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte f141145h = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f141146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f141148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f141149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f[] f141150e;

        public j(List<b> list, Set<Short> set, int i10) {
            byte[] bArr = new byte[64];
            this.f141148c = bArr;
            this.f141147b = i10;
            bArr[0] = 64;
            this.f141150e = new f[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f141150e[i11] = new f(i11, list.get(i11).f141099e);
            }
            this.f141149d = new int[i10];
            int i12 = 0;
            for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
                if (set.contains(Short.valueOf(s10))) {
                    this.f141149d[s10] = i12;
                    i12 += 16;
                } else {
                    this.f141149d[s10] = -1;
                }
            }
            this.f141146a = new e(n.f141087d, (short) 84, a());
        }

        public int a() {
            return b() + (this.f141150e.length * 16);
        }

        public final int b() {
            return c() + 84;
        }

        public final int c() {
            return this.f141149d.length * 4;
        }

        public void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f141146a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{n.f141092i, 0, 0, 0});
            byteArrayOutputStream.write(n.j(this.f141147b));
            byteArrayOutputStream.write(n.j(b()));
            byteArrayOutputStream.write(this.f141148c);
            for (int i10 : this.f141149d) {
                byteArrayOutputStream.write(n.j(i10));
            }
            for (f fVar : this.f141150e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final short f141151e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f141152f = 1073741824;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f141153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f141155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f141156d;

        public k(List<b> list) {
            this.f141154b = list.get(list.size() - 1).f141097c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f141097c));
            }
            this.f141155c = new int[this.f141154b];
            for (short s10 = 0; s10 < this.f141154b; s10 = (short) (s10 + 1)) {
                if (hashSet.contains(Short.valueOf(s10))) {
                    this.f141155c[s10] = 1073741824;
                }
            }
            this.f141153a = new e(n.f141088e, (short) 16, a());
            this.f141156d = new j(list, hashSet, this.f141154b);
        }

        public final int a() {
            return (this.f141154b * 4) + 16;
        }

        public int b() {
            return a() + this.f141156d.a();
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f141153a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{n.f141092i, 0, 0, 0});
            byteArrayOutputStream.write(n.j(this.f141154b));
            for (int i10 : this.f141155c) {
                byteArrayOutputStream.write(n.j(i10));
            }
            this.f141156d.d(byteArrayOutputStream);
        }
    }

    public static byte[] h(char c10) {
        return new byte[]{(byte) (c10 & 255), (byte) ((c10 >> '\b') & 255)};
    }

    public static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap map2 = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f141098d + ", typeId=" + Integer.toHexString(bVar2.f141096b & 255));
            }
            if (bVar2.f141095a == 1) {
                dVar = f141093j;
            } else {
                if (bVar2.f141095a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f141095a));
                }
                dVar = dVar2;
            }
            if (!map2.containsKey(dVar)) {
                map2.put(dVar, new ArrayList());
            }
            ((List) map2.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b10 = bVar.f141096b;
        f141092i = b10;
        if (b10 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new g(map2).b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] j(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    public static byte[] k(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrK = k((short) charArray.length);
        bArr[0] = bArrK[0];
        bArr[1] = bArrK[1];
        for (int i10 = 0; i10 < charArray.length; i10++) {
            byte[] bArrH = h(charArray[i10]);
            int i11 = i10 * 2;
            bArr[i11 + 2] = bArrH[0];
            bArr[i11 + 3] = bArrH[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
