package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class gw6 extends wil {
    public float n0;

    @Deprecated
    public final HashMap<String, Float> o0;

    @Deprecated
    public final HashMap<String, Float> p0;

    @Deprecated
    public final HashMap<String, Float> q0;
    public HashMap<String, Float> r0;
    public HashMap<String, Float> s0;
    public rwd0.a t0;

    public gw6(rwd0 rwd0Var, rwd0.d dVar) {
        super(rwd0Var, dVar);
        this.n0 = 0.5f;
        this.o0 = new HashMap<>();
        this.p0 = new HashMap<>();
        this.q0 = new HashMap<>();
        this.t0 = rwd0.a.a;
    }

    public final float t(String str) {
        HashMap<String, Float> map = this.s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.s0.get(str).floatValue();
    }

    public final float u(String str) {
        HashMap<String, Float> map = this.q0;
        if (map.containsKey(str)) {
            return map.get(str).floatValue();
        }
        return 0.0f;
    }

    public final float v(String str) {
        HashMap<String, Float> map = this.r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.r0.get(str).floatValue();
    }

    public final float w(String str) {
        HashMap<String, Float> map = this.p0;
        if (map.containsKey(str)) {
            return map.get(str).floatValue();
        }
        return 0.0f;
    }
}
