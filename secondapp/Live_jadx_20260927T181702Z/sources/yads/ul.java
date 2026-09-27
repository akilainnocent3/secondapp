package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f156493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f156494f;

    public ul(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f156489a = arrayList;
        this.f156490b = i10;
        this.f156491c = i11;
        this.f156492d = i12;
        this.f156493e = f10;
        this.f156494f = str;
    }

    public static ul a(jb2 jb2Var) throws ob2 {
        String str;
        int i10;
        float f10;
        int i11;
        try {
            jb2Var.e(jb2Var.f151002b + 4);
            int iM = (jb2Var.m() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = jb2Var.m() & 31;
            for (int i12 = 0; i12 < iM2; i12++) {
                int iR = jb2Var.r();
                int i13 = jb2Var.f151002b;
                jb2Var.e(i13 + iR);
                byte[] bArr = jb2Var.f151001a;
                byte[] bArr2 = new byte[iR + 4];
                System.arraycopy(jx.f151295a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i13, bArr2, 4, iR);
                arrayList.add(bArr2);
            }
            int iM3 = jb2Var.m();
            for (int i14 = 0; i14 < iM3; i14++) {
                int iR2 = jb2Var.r();
                int i15 = jb2Var.f151002b;
                jb2Var.e(i15 + iR2);
                byte[] bArr3 = jb2Var.f151001a;
                byte[] bArr4 = new byte[iR2 + 4];
                System.arraycopy(jx.f151295a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i15, bArr4, 4, iR2);
                arrayList.add(bArr4);
            }
            if (iM2 > 0) {
                cy1 cy1VarB = dy1.b((byte[]) arrayList.get(0), iM, ((byte[]) arrayList.get(0)).length);
                int i16 = cy1VarB.f147952e;
                int i17 = cy1VarB.f147953f;
                float f11 = cy1VarB.f147954g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cy1VarB.f147948a), Integer.valueOf(cy1VarB.f147949b), Integer.valueOf(cy1VarB.f147950c));
                i10 = i17;
                f10 = f11;
                i11 = i16;
            } else {
                str = null;
                i10 = -1;
                f10 = 1.0f;
                i11 = -1;
            }
            return new ul(arrayList, iM, i11, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ob2("Error parsing AVC config", e10, true, 1);
        }
    }
}
