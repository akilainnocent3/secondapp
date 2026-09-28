package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$special$$inlined$flatMapLatest$3", f = "LNStreamPlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class tfr extends tje0 implements gaj<myh<? super UiText>, fgr, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfr(v1b v1bVar, mfr mfrVar) {
        super(3, v1bVar);
        this.d = mfrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super UiText> myhVar, fgr fgrVar, v1b<? super Unit> v1bVar) {
        tfr tfrVar = new tfr(v1bVar, this.d);
        tfrVar.b = myhVar;
        tfrVar.c = fgrVar;
        return tfrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[RETURN] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        lyh gzhVar2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            fgr fgrVar = (fgr) this.c;
            if (Intrinsics.g(fgrVar, fgr.a.a) || fgrVar == null) {
                gzhVar = new gzh(vch0.a);
            } else {
                if (fgrVar instanceof fgr.b) {
                    Date date = new Date(((fgr.b) fgrVar).a);
                    Locale locale = Locale.US;
                    locale.getClass();
                    Object[] objArr = {bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0)};
                    StringUiText stringUiText = vch0.a;
                    gzhVar2 = new gzh(new ResourceUiText(R.string.page_lucky_numbers__streaming_hint_next_streaming, ay0.S(objArr)));
                } else {
                    if (!(fgrVar instanceof fgr.c)) {
                        uhc.a();
                        return null;
                    }
                    gzhVar = new cgr(this.d.Z);
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, gzhVar2, this) == y5bVar) {
                    return y5bVar;
                }
            }
            gzhVar2 = gzhVar;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar2, this) == y5bVar) {
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
