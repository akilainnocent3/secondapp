package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$loadCustomCodeList$3", f = "CustomCodeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wbc extends tje0 implements Function2<bxg0<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>, ? extends lk50<? extends sbc.a>>, v1b<? super lyh<? extends lk50<? extends x8c>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sbc b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbc(sbc sbcVar, boolean z, v1b<? super wbc> v1bVar) {
        super(2, v1bVar);
        this.b = sbcVar;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wbc wbcVar = new wbc(this.b, this.c, v1bVar);
        wbcVar.a = obj;
        return wbcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bxg0<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>, ? extends lk50<? extends sbc.a>> bxg0Var, v1b<? super lyh<? extends lk50<? extends x8c>>> v1bVar) {
        return ((wbc) create(bxg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object bVar;
        Object bVar2;
        Object bVar3;
        bxg0 bxg0Var = (bxg0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Object obj2 = bxg0Var.b;
        Object obj3 = bxg0Var.c;
        List listK = b.k(bxg0Var.a, obj2, obj3);
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (((lk50) it.next()) instanceof lk50.b) {
                    return new gzh(lk50.b.a);
                }
            }
        }
        Iterator it2 = listK.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((lk50) next) instanceof lk50.a));
        lk50 lk50Var = (lk50) next;
        if (lk50Var instanceof lk50.a) {
            return new gzh(lk50Var);
        }
        try {
            zi50.a aVar = zi50.b;
            Object obj4 = bxg0Var.a;
            if (!(obj4 instanceof lk50.c)) {
                obj4 = null;
            }
            lk50.c cVar = (lk50.c) obj4;
            bVar = cVar != null ? (AliasCodeList) cVar.a : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        AliasCodeList aliasCodeList = (AliasCodeList) bVar;
        if (aliasCodeList == null) {
            return new gzh(new lk50.a(new Throwable("alias response is null")));
        }
        try {
            if (!(obj2 instanceof lk50.c)) {
                obj2 = null;
            }
            lk50.c cVar2 = (lk50.c) obj2;
            bVar2 = cVar2 != null ? (j8c) cVar2.a : null;
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        if (bVar2 instanceof zi50.b) {
            bVar2 = null;
        }
        final j8c j8cVar = (j8c) bVar2;
        if (j8cVar == null) {
            return new gzh(new lk50.a(new Throwable("flags not found")));
        }
        try {
            if (!(obj3 instanceof lk50.c)) {
                obj3 = null;
            }
            lk50.c cVar3 = (lk50.c) obj3;
            bVar3 = cVar3 != null ? (sbc.a) cVar3.a : null;
        } catch (Throwable th3) {
            zi50.a aVar4 = zi50.b;
            bVar3 = new zi50.b(th3);
        }
        final sbc.a aVar5 = (sbc.a) (bVar3 instanceof zi50.b ? null : bVar3);
        if (aVar5 == null) {
            return new gzh(new lk50.a(new Throwable("user info not found")));
        }
        String str = aVar5.a;
        return (!aliasCodeList.getCode().isEmpty() || j8cVar.a || this.c) ? new gzh(new lk50.c(new x8c(aliasCodeList, j8cVar, str, aVar5.b))) : new wl50(bm50.a(this.b.a("", str)), new Function1() { // from class: vbc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                j8c j8cVar2 = j8cVar;
                j8c j8cVar3 = new j8c(true, j8cVar2.b, j8cVar2.c);
                sbc.a aVar6 = aVar5;
                return new x8c((AliasCodeList) obj5, j8cVar3, aVar6.a, aVar6.b);
            }
        });
    }
}
