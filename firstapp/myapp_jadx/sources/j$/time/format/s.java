package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public class s implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final j$.time.f a;
    public final String b;

    public s(j$.time.f fVar, String str) {
        this.a = fVar;
        this.b = str;
    }

    public static int b(u uVar, CharSequence charSequence, int i, int i2, j jVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            uVar.e(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || uVar.a(charSequence.charAt(i2), 'Z')) {
            uVar.e(ZoneId.of(upperCase));
            return i2;
        }
        u uVar2 = new u(uVar.a);
        uVar2.b = uVar.b;
        uVar2.c = uVar.c;
        int iC = jVar.C(uVar2, charSequence, i2);
        try {
            if (iC >= 0) {
                uVar.e(ZoneId.K(upperCase, ZoneOffset.d0((int) uVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iC;
            }
            if (jVar == j.e) {
                return ~i;
            }
            uVar.e(ZoneId.of(upperCase));
            return i2;
        } catch (j$.time.b unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.e
    public final int C(u uVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(uVar, charSequence, i, i, j.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (uVar.a(cCharAt, 'U') && uVar.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !uVar.a(charSequence.charAt(i3), 'C')) ? b(uVar, charSequence, i, i3, j.f) : b(uVar, charSequence, i, i4, j.f);
            }
            if (uVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && uVar.a(cCharAt2, 'M') && uVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !uVar.a(charSequence.charAt(i2), '0')) {
                    return b(uVar, charSequence, i, i2, j.f);
                }
                uVar.e(ZoneId.of("GMT0"));
                return i5;
            }
        }
        m mVarA = a(uVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC != null) {
            uVar.e(ZoneId.of(strC));
            return parsePosition.getIndex();
        }
        if (!uVar.a(cCharAt, 'Z')) {
            return ~i;
        }
        uVar.e(ZoneOffset.UTC);
        return i + 1;
    }

    public m a(u uVar) {
        Set<String> set = j$.time.zone.i.d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = uVar.b ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = uVar.b ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        m mVar = uVar.b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                        if (uVar.b) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    public final String toString() {
        return this.b;
    }

    @Override // j$.time.format.e
    public boolean x(w wVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) wVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.r());
        return true;
    }
}
