package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialScreenKt$SocialContent$2$1", f = "PersonalSocialScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qp00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ List<k130> a;
    public final /* synthetic */ ytw<k130> b;
    public final /* synthetic */ ytw<k130> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qp00(List<? extends k130> list, ytw<k130> ytwVar, ytw<k130> ytwVar2, v1b<? super qp00> v1bVar) {
        super(2, v1bVar);
        this.a = list;
        this.b = ytwVar;
        this.c = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qp00(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qp00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<k130> list = this.a;
        if (list.isEmpty()) {
            return Unit.a;
        }
        ytw<k130> ytwVar = this.b;
        k130 value = ytwVar.getValue();
        ytw<k130> ytwVar2 = this.c;
        k130 value2 = ytwVar2.getValue();
        List<l130> list2 = m130.a;
        value.getClass();
        if (value2 != null) {
            if (!list.contains(value2)) {
                value2 = null;
            }
            if (value2 == null) {
                if (list.contains(value)) {
                    value2 = null;
                } else {
                    value2 = k130.a;
                    if (!list.contains(value2)) {
                        value2 = k130.b;
                        if (!list.contains(value2)) {
                            value2 = (k130) CollectionsKt.T(list);
                        }
                    }
                }
            }
        } else if (list.contains(value)) {
            value2 = null;
        } else {
            value2 = k130.a;
            if (!list.contains(value2)) {
                value2 = k130.b;
                if (!list.contains(value2)) {
                    value2 = (k130) CollectionsKt.T(list);
                }
            }
        }
        if (value2 != null) {
            ytwVar.setValue(value2);
            if (value2 == ytwVar2.getValue()) {
                ytwVar2.setValue(null);
            }
        }
        return Unit.a;
    }
}
