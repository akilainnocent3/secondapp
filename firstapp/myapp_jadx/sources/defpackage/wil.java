package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class wil extends rwa implements e6h {
    public final rwd0 k0;
    public final rwd0.d l0;
    public final ArrayList<Object> m0;

    public wil(rwd0 rwd0Var, rwd0.d dVar) {
        super(rwd0Var);
        this.m0 = new ArrayList<>();
        this.k0 = rwd0Var;
        this.l0 = dVar;
    }

    @Override // defpackage.rwa, defpackage.eq40
    public final ixa a() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public yil s() {
        return null;
    }

    @Override // defpackage.rwa, defpackage.eq40, defpackage.e6h
    public void apply() {
    }
}
