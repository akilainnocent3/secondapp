package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$onDoneClicked$1", f = "EditUsernameViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class ovf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lvf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ lvf a;
        public final /* synthetic */ String b;

        public a(lvf lvfVar, String str) {
            this.a = lvfVar;
            this.b = str;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            nsx nsxVar;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            lvf lvfVar = this.a;
            if (!z) {
                if (lk50Var instanceof lk50.a) {
                    lvfVar.x1(jvf.f.a);
                } else if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            }
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
            baseResponse.getClass();
            int i = baseResponse.bizCode;
            if (i != 10000) {
                switch (i) {
                    case 11011:
                        nsxVar = nsx.f.a;
                        break;
                    case 11012:
                    case 11013:
                        nsxVar = nsx.c.a;
                        break;
                    default:
                        switch (i) {
                            case 11015:
                                nsxVar = nsx.g.a;
                                break;
                            case 11016:
                                nsxVar = nsx.a.a;
                                break;
                            case 11017:
                                nsxVar = nsx.d.a;
                                break;
                            default:
                                nsxVar = nsx.b.a;
                                break;
                        }
                        break;
                }
            } else {
                nsxVar = nsx.e.a;
            }
            return lvfVar.z1(nsxVar, this.b, v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovf(v1b v1bVar, lvf lvfVar) {
        super(2, v1bVar);
        this.b = lvfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ovf(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ovf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kqh0 kqh0Var;
        lvf lvfVar = this.b;
        v340 v340Var = lvfVar.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = ((kvf) v340Var.a.getValue()).b.a.b;
            kvf kvfVar = (kvf) v340Var.a.getValue();
            if (!kvfVar.c || !kvfVar.d || ((kqh0Var = kvfVar.e) != kqh0.c && kqh0Var != kqh0.f)) {
                return Unit.a;
            }
            uga0 uga0Var = lvfVar.f;
            uga0Var.getClass();
            str.getClass();
            yzh yzhVarA = bm50.a(uga0Var.a.h0(str));
            a aVar = new a(lvfVar, str);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
