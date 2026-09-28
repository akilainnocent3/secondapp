package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cp1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public cp1(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static cp1 a(nsz nszVar) throws ssz {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            nszVar.J(4);
            int iW = (nszVar.w() & 3) + 1;
            if (iW == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iW2 = nszVar.w() & 31;
            for (int i9 = 0; i9 < iW2; i9++) {
                int iC = nszVar.C();
                int i10 = nszVar.b;
                nszVar.J(iC);
                byte[] bArr = nszVar.a;
                byte[] bArr2 = new byte[iC + 4];
                System.arraycopy(j08.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iC);
                arrayList.add(bArr2);
            }
            int iW3 = nszVar.w();
            for (int i11 = 0; i11 < iW3; i11++) {
                int iC2 = nszVar.C();
                int i12 = nszVar.b;
                nszVar.J(iC2);
                byte[] bArr3 = nszVar.a;
                byte[] bArr4 = new byte[iC2 + 4];
                System.arraycopy(j08.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iC2);
                arrayList.add(bArr4);
            }
            if (iW2 > 0) {
                qbx.m mVarJ = qbx.j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = mVarJ.e;
                int i14 = mVarJ.f;
                int i15 = mVarJ.h + 8;
                int i16 = mVarJ.i + 8;
                int i17 = mVarJ.p;
                int i18 = mVarJ.q;
                int i19 = mVarJ.r;
                int i20 = mVarJ.s;
                float f2 = mVarJ.g;
                int i21 = mVarJ.a;
                int i22 = mVarJ.b;
                int i23 = mVarJ.c;
                byte[] bArr5 = j08.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new cp1(arrayList, iW, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ssz.a(e, "Error parsing AVC config");
        }
    }
}
