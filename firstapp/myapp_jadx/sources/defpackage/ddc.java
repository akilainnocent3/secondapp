package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$shareCustomCode$1", f = "CustomCodeViewModel.kt", l = {698, 702}, m = "invokeSuspend", v = 2)
public final class ddc extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public bdc a;
    public String b;
    public v2b.a c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bdc f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddc(bdc bdcVar, String str, v1b<? super ddc> v1bVar) {
        super(2, v1bVar);
        this.f = bdcVar;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ddc ddcVar = new ddc(this.f, this.i, v1bVar);
        ddcVar.e = obj;
        return ddcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ddc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        UiText uiTextD;
        String str;
        bdc bdcVar;
        v2b v2bVar;
        bdc bdcVar2;
        y5b y5bVar = y5b.a;
        int i = this.d;
        bdc bdcVar3 = this.f;
        try {
            if (i == 0) {
                uj50.b(obj);
                String str2 = this.i;
                zi50.a aVar = zi50.b;
                x2b x2bVar = bdcVar3.e;
                this.e = null;
                this.a = bdcVar3;
                this.b = str2;
                this.d = 1;
                Object objA = x2bVar.a(str2, this);
                if (objA != y5bVar) {
                    str = str2;
                    obj = objA;
                    bdcVar = bdcVar3;
                }
                return y5bVar;
            }
            if (i == 1) {
                str = this.b;
                bdcVar = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2bVar = this.c;
                str = this.b;
                bdcVar2 = this.a;
                uj50.b(obj);
            }
            wuw<h8c> wuwVar = bdcVar2.I;
            h8c.a aVar2 = new h8c.a(str, ((v2b.a) v2bVar).d, ((v4k) obj).a);
            wuwVar.getClass();
            wuwVar.a.c(aVar2);
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                wuw<h8c> wuwVar2 = bdcVar3.I;
                if (thA instanceof SprThrowable) {
                    uiTextD = vch0.d(((SprThrowable) thA).getE());
                } else {
                    uiTextD = vch0.b;
                }
                h8c.c cVar = new h8c.c(thA, uiTextD);
                wuwVar2.getClass();
                wuwVar2.a.c(cVar);
            }
            return Unit.a;
            v2b v2bVar2 = (v2b) obj;
            if (!(v2bVar2 instanceof v2b.a)) {
                throw new Exception("Is not alias code.");
            }
            x4k x4kVar = bdcVar.f;
            String str3 = ((v2b.a) v2bVar2).b;
            this.e = null;
            this.a = bdcVar;
            this.b = str;
            this.c = (v2b.a) v2bVar2;
            this.d = 2;
            Object objA2 = x4kVar.a(str3, this);
            if (objA2 != y5bVar) {
                v2bVar = v2bVar2;
                obj = objA2;
                bdcVar2 = bdcVar;
                wuw<h8c> wuwVar3 = bdcVar2.I;
                h8c.a aVar4 = new h8c.a(str, ((v2b.a) v2bVar).d, ((v4k) obj).a);
                wuwVar3.getClass();
                wuwVar3.a.c(aVar4);
                bVar = Unit.a;
                zi50.a aVar5 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    wuw<h8c> wuwVar4 = bdcVar3.I;
                    if (thA instanceof SprThrowable) {
                        uiTextD = vch0.d(((SprThrowable) thA).getE());
                    } else {
                        uiTextD = vch0.b;
                    }
                    h8c.c cVar2 = new h8c.c(thA, uiTextD);
                    wuwVar4.getClass();
                    wuwVar4.a.c(cVar2);
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar6 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
