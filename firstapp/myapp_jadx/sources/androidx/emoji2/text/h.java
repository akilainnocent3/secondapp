package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import defpackage.bpv;
import defpackage.cpv;
import defpackage.km20;
import defpackage.t9h0;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final cpv a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    public h(Typeface typeface, cpv cpvVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = cpvVar;
        int iA = cpvVar.a(6);
        if (iA != 0) {
            int i5 = iA + cpvVar.a;
            i = cpvVar.b.getInt(cpvVar.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = cpvVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + cpvVar.a;
            i2 = cpvVar.b.getInt(cpvVar.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            t9h0 t9h0Var = new t9h0(this, i7);
            bpv bpvVarB = t9h0Var.b();
            int iA3 = bpvVarB.a(4);
            Character.toChars(iA3 != 0 ? bpvVarB.b.getInt(iA3 + bpvVarB.a) : 0, this.b, i7 * 2);
            bpv bpvVarB2 = t9h0Var.b();
            int iA4 = bpvVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + bpvVarB2.a;
                i3 = bpvVarB2.b.getInt(bpvVarB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            km20.a("invalid metadata codepoint length", i3 > 0);
            a aVar = this.c;
            bpv bpvVarB3 = t9h0Var.b();
            int iA5 = bpvVarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + bpvVarB3.a;
                i4 = bpvVarB3.b.getInt(bpvVarB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            aVar.a(t9h0Var, 0, i4 - 1);
        }
    }

    public static class a {
        public final SparseArray<a> a;
        public t9h0 b;

        public a(int i) {
            this.a = new SparseArray<>(i);
        }

        public final void a(t9h0 t9h0Var, int i, int i2) {
            int iA = t9h0Var.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(t9h0Var.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(t9h0Var, i + 1, i2);
            } else {
                aVar.b = t9h0Var;
            }
        }

        public a() {
            this(1);
        }
    }
}
