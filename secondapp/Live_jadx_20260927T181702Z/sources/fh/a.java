package fh;

import androidx.annotation.Nullable;
import eh.m0;
import eh.t0;
import java.util.ArrayList;
import java.util.List;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f84290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f84294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f84296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f84297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f84298i;

    public a(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, @Nullable String str) {
        this.f84290a = list;
        this.f84291b = i10;
        this.f84292c = i11;
        this.f84293d = i12;
        this.f84294e = i13;
        this.f84295f = i14;
        this.f84296g = i15;
        this.f84297h = f10;
        this.f84298i = str;
    }

    public static byte[] a(t0 t0Var) {
        int iR = t0Var.R();
        int iF = t0Var.f();
        t0Var.Z(iR);
        return eh.i.d(t0Var.e(), iF, iR);
    }

    public static a b(t0 t0Var) throws d4 {
        String strA;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        try {
            t0Var.Z(4);
            int iL = (t0Var.L() & 3) + 1;
            if (iL == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iL2 = t0Var.L() & 31;
            for (int i15 = 0; i15 < iL2; i15++) {
                arrayList.add(a(t0Var));
            }
            int iL3 = t0Var.L();
            for (int i16 = 0; i16 < iL3; i16++) {
                arrayList.add(a(t0Var));
            }
            if (iL2 > 0) {
                m0.c cVarL = m0.l((byte[]) arrayList.get(0), iL, ((byte[]) arrayList.get(0)).length);
                int i17 = cVarL.f81111f;
                int i18 = cVarL.f81112g;
                int i19 = cVarL.f81120o;
                int i20 = cVarL.f81121p;
                int i21 = cVarL.f81122q;
                float f11 = cVarL.f81113h;
                strA = eh.i.a(cVarL.f81106a, cVarL.f81107b, cVarL.f81108c);
                i12 = i20;
                i13 = i21;
                f10 = f11;
                i10 = i17;
                i11 = i18;
                i14 = i19;
            } else {
                strA = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f10 = 1.0f;
                i14 = -1;
            }
            return new a(arrayList, iL, i10, i11, i14, i12, i13, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw d4.a("Error parsing AVC config", e10);
        }
    }
}
