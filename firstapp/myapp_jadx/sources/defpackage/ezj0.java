package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ezj0 {
    public final vyj0 a;
    public final bzj0 b;
    public final Function0<Unit> c;

    public ezj0(vyj0 vyj0Var, Function0 function0) {
        bzj0.b bVar = bzj0.b.a;
        vyj0Var.getClass();
        bVar.getClass();
        this.a = vyj0Var;
        this.b = bVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezj0)) {
            return false;
        }
        ezj0 ezj0Var = (ezj0) obj;
        return Intrinsics.g(this.a, ezj0Var.a) && Intrinsics.g(this.b, ezj0Var.b) && Intrinsics.g(this.c, ezj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WorldCupMissionBannerUiState(content=" + this.a + ", overlay=" + this.b + ", onClick=" + this.c + ")";
    }
}
