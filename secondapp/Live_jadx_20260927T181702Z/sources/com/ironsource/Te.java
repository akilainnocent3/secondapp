package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Te implements O8, O8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Map<String, Integer> f60157a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final Map<String, Integer> f60158b = new HashMap();

    @Override // com.ironsource.O8.a
    public void a(@oy.l List<? extends O8.b> smashes) {
        kotlin.jvm.internal.m0.p(smashes, "smashes");
        for (O8.b bVar : smashes) {
            this.f60157a.put(bVar.c(), 0);
            this.f60158b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.ironsource.O8
    public boolean b(@oy.l O8.b smash) {
        boolean z10;
        kotlin.jvm.internal.m0.p(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.f60157a.containsKey(strC)) {
                Integer num = this.f60157a.get(strC);
                kotlin.jvm.internal.m0.m(num);
                if (num.intValue() >= smash.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.ironsource.O8.a
    public void a(@oy.l O8.b smash) {
        kotlin.jvm.internal.m0.p(smash, "smash");
        synchronized (this) {
            try {
                String strC = smash.c();
                if (this.f60157a.containsKey(strC)) {
                    Map<String, Integer> map = this.f60157a;
                    Integer num = map.get(strC);
                    kotlin.jvm.internal.m0.m(num);
                    map.put(strC, Integer.valueOf(num.intValue() + 1));
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.O8
    public boolean a() {
        for (String str : this.f60158b.keySet()) {
            Integer num = this.f60157a.get(str);
            kotlin.jvm.internal.m0.m(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f60158b.get(str);
            kotlin.jvm.internal.m0.m(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
