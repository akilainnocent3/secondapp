package o0;

import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c B(char[] cArr) {
        return new a(cArr);
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String strZ = z();
        if (i11 > 0 || strZ.length() + i10 >= c.f118576g) {
            sb2.append("[\n");
            boolean z10 = true;
            for (c cVar : this.f118575i) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                a(sb2, c.f118577h + i10);
                sb2.append(cVar.y(c.f118577h + i10, i11 - 1));
            }
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            a(sb2, i10);
            sb2.append(C4235d4.j.f61462e);
        } else {
            sb2.append(strZ);
        }
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        StringBuilder sb2 = new StringBuilder(i() + C4235d4.j.f61460d);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f118575i.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.f118575i.get(i10).z());
        }
        return ((Object) sb2) + C4235d4.j.f61462e;
    }
}
