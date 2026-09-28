package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oxr implements t {
    public final dxr a;
    public final rce0 b;
    public final c c;
    public final msw<List<vhv>> d;

    public oxr(dxr dxrVar, rce0 rce0Var) {
        this.a = dxrVar;
        this.b = rce0Var;
        this.c = (c) dxrVar.b.invoke();
        hwo.a();
        this.d = new msw<>();
    }

    @Override // defpackage.mmd
    public final float C1(float f) {
        return this.b.C1(f);
    }

    @Override // defpackage.mmd
    public final float D0(long j) {
        return this.b.D0(j);
    }

    @Override // defpackage.mmd
    public final int I1(long j) {
        return this.b.I1(j);
    }

    @Override // androidx.compose.ui.layout.t
    public final biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
        return this.b.K1(i, i2, map, function1, function2);
    }

    @Override // defpackage.mmd
    public final long N(float f) {
        return this.b.N(f);
    }

    @Override // defpackage.mmd
    public final long O(long j) {
        return this.b.O(j);
    }

    @Override // defpackage.mmd
    public final long U1(long j) {
        return this.b.U1(j);
    }

    @Override // defpackage.mmd
    public final float X(long j) {
        return this.b.X(j);
    }

    public final List<vhv> e(int i) {
        msw<List<vhv>> mswVar = this.d;
        List<vhv> listB = mswVar.b(i);
        if (listB != null) {
            return listB;
        }
        c cVar = this.c;
        Object objG = cVar.g(i);
        List<vhv> listK = this.b.K(objG, this.a.a(i, objG, cVar.e(i)));
        mswVar.h(i, listK);
        return listK;
    }

    @Override // androidx.compose.ui.layout.t
    public final biv e1(int i, int i2, Map<kt, Integer> map, Function1<? super y.a, Unit> function1) {
        return this.b.e1(i, i2, map, function1);
    }

    @Override // defpackage.mmd
    public final long g0(float f) {
        return this.b.g0(f);
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.nzo
    public final asr getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.nzo
    public final boolean q0() {
        return this.b.q0();
    }

    @Override // defpackage.mmd
    public final float u1(int i) {
        return this.b.u1(i);
    }

    @Override // defpackage.mmd
    public final float v1(float f) {
        return this.b.v1(f);
    }

    @Override // defpackage.mmd
    public final int y0(float f) {
        return this.b.y0(f);
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.b.y1();
    }
}
