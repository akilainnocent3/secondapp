package defpackage;

import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.domain.entity.RelatedBet;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.relatedbets.RelatedBetsViewKt$RelatedBetsView$1$1", f = "RelatedBetsView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c250 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ i250 a;
    public final /* synthetic */ RelatedBetRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c250(i250 i250Var, RelatedBetRequest relatedBetRequest, v1b<? super c250> v1bVar) {
        super(2, v1bVar);
        this.a = i250Var;
        this.b = relatedBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c250(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c250) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.sporty.android.book.data.entity.RelatedBetRequest] */
    /* JADX WARN: Type inference failed for: r6v0, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        i250 i250Var = this.a;
        List list = (List) ((UIState) i250Var.c.getValue()).getData();
        if (list == null) {
            list = m2g.a;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RelatedBet) it.next()).getUniqueId());
        }
        ?? r10 = this.b;
        String str = (String) CollectionsKt.U(CollectionsKt.Y(r10.getUniqueIds(), CollectionsKt.E0(arrayList2)));
        if (str != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (!Intrinsics.g(((RelatedBet) obj2).getUniqueId(), str)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                RelatedBet relatedBet = (RelatedBet) arrayList3.get(i);
                try {
                    zi50.a aVar = zi50.b;
                    bVar = h880.a(relatedBet.getEvent());
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                RelatedBetRequest.Selection selection = (RelatedBetRequest.Selection) bVar;
                if (selection != null) {
                    arrayList.add(selection);
                }
                i = i2;
            }
        } else {
            arrayList = m2g.a;
        }
        RelatedBetRequest relatedBetRequestAppendSelections = r10.appendSelections(arrayList);
        adk adkVar = i250Var.a;
        adkVar.getClass();
        relatedBetRequestAppendSelections.getClass();
        kzh.d(new yzh(new g1i(new xzh(ozh.c(adkVar.a.c(relatedBetRequestAppendSelections), adkVar.b), new f250(i250Var, str, list2, null)), new g250(i250Var, str, list2, arrayList2, null)), new h250(i250Var, null)), o8i0.d(i250Var));
        return Unit.a;
    }
}
