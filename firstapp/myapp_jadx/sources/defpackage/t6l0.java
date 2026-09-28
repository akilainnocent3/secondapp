package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t6l0 {
    public final /* synthetic */ e7l0 a;

    public t6l0(e7l0 e7l0Var) {
        this.a = e7l0Var;
    }

    public final void a(int i, String str, List list, boolean z, boolean z2) {
        u4l0 u4l0Var;
        k8l0 k8l0Var = this.a.a;
        int i2 = i - 1;
        if (i2 == 0) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            u4l0Var = y4l0Var.m;
        } else if (i2 != 1) {
            if (i2 == 3) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                u4l0Var = y4l0Var2.n;
            } else if (i2 != 4) {
                y4l0 y4l0Var3 = k8l0Var.f;
                k8l0.m(y4l0Var3);
                u4l0Var = y4l0Var3.l;
            } else if (z) {
                y4l0 y4l0Var4 = k8l0Var.f;
                k8l0.m(y4l0Var4);
                u4l0Var = y4l0Var4.j;
            } else if (z2) {
                y4l0 y4l0Var5 = k8l0Var.f;
                k8l0.m(y4l0Var5);
                u4l0Var = y4l0Var5.i;
            } else {
                y4l0 y4l0Var6 = k8l0Var.f;
                k8l0.m(y4l0Var6);
                u4l0Var = y4l0Var6.k;
            }
        } else if (z) {
            y4l0 y4l0Var7 = k8l0Var.f;
            k8l0.m(y4l0Var7);
            u4l0Var = y4l0Var7.g;
        } else if (z2) {
            y4l0 y4l0Var8 = k8l0Var.f;
            k8l0.m(y4l0Var8);
            u4l0Var = y4l0Var8.f;
        } else {
            y4l0 y4l0Var9 = k8l0Var.f;
            k8l0.m(y4l0Var9);
            u4l0Var = y4l0Var9.h;
        }
        int size = list.size();
        if (size == 1) {
            u4l0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            u4l0Var.c(list.get(0), str, list.get(1));
        } else if (size != 3) {
            u4l0Var.a(str);
        } else {
            u4l0Var.d(list.get(0), str, list.get(1), list.get(2));
        }
    }
}
