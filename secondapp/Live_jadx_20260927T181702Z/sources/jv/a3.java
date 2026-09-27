package jv;

import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1510#1:1584,6\n*E\n"})
public final class a3 extends qv.d0 implements h2 {
    @oy.l
    public final String E(@oy.l String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object objK = k();
        kotlin.jvm.internal.m0.n(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z10 = true;
        for (qv.f0 f0VarL = (qv.f0) objK; !kotlin.jvm.internal.m0.g(f0VarL, this); f0VarL = f0VarL.l()) {
            if (f0VarL instanceof u2) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(f0VarL);
            }
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    @Override // jv.h2
    public boolean isActive() {
        return true;
    }

    @Override // qv.f0
    @oy.l
    public String toString() {
        return super.toString();
    }

    @Override // jv.h2
    @oy.l
    public a3 c() {
        return this;
    }
}
