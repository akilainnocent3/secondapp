package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyn10;", "Lavw;", "Lgr10;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yn10 extends avw<gr10> {
    public final j750 e;
    public final lv0 f;
    public final uqm i;
    public final jrf v;

    @c0d(c = "com.sportybet.feature.playtimecontrol.remove.viewmodel.PlayTimeControlRemoveViewModel", f = "PlayTimeControlRemoveViewModel.kt", l = {65, 67, 69, 79, 89}, m = "callTimeOut", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return yn10.this.z1(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn10(j750 j750Var, lv0 lv0Var, uqm uqmVar, jrf jrfVar) {
        super(new gr10(0));
        uqmVar.getClass();
        this.e = j750Var;
        this.f = lv0Var;
        this.i = uqmVar;
        this.v = jrfVar;
        y1(new xn10(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(v1b<? super Unit> v1bVar) {
        a aVar;
        Object objEmit;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object objA = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        b390 b390Var = this.c;
        if (i2 == 0) {
            uj50.b(objA);
            this.v.getClass();
            String strB = jrf.b(1);
            aVar.c = 1;
            objA = s0i.a(new sl50(bm50.b(this.f.a.n0(new TimeSelfExclusionRequest(strB, true)), vch0.b)), aVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(objA);
                    return objA;
                }
                if (i2 == 4) {
                    uj50.b(objA);
                    return objA;
                }
                if (i2 == 5) {
                    uj50.b(objA);
                    return objA;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        this.i.logout();
        fr10.a aVar2 = fr10.a.a;
        aVar.c = 3;
        objEmit = b390Var.emit(aVar2, aVar);
        if (objEmit != y5bVar) {
            return y5bVar;
        }
        return objEmit;
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            StringUiText stringUiText = vch0.a;
            rb90 rb90Var = new rb90(new ResourceUiText(R.string.playtime_control__time_out_removed_succes));
            aVar.c = 2;
            if (b390Var.emit(rb90Var, aVar) != y5bVar) {
                this.i.logout();
                fr10.a aVar3 = fr10.a.a;
                aVar.c = 3;
                objEmit = b390Var.emit(aVar3, aVar);
                if (objEmit != y5bVar) {
                    return objEmit;
                }
            }
        } else if (!(lk50Var instanceof lk50.a)) {
            StringUiText stringUiText2 = vch0.a;
            grf.c cVar = new grf.c(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again));
            aVar.c = 5;
            Object objEmit2 = b390Var.emit(cVar, aVar);
            if (objEmit2 != y5bVar) {
                return objEmit2;
            }
        } else {
            if (bm50.j(lk50Var, 11900) != null) {
                y1(new zn10(this, null));
                return Unit.a;
            }
            StringUiText stringUiText3 = vch0.a;
            grf.c cVar2 = new grf.c(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again));
            aVar.c = 4;
            Object objEmit3 = b390Var.emit(cVar2, aVar);
            if (objEmit3 != y5bVar) {
                return objEmit3;
            }
        }
        return y5bVar;
    }
}
