package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$2", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jjw extends tje0 implements iaj<lk50<? extends List<? extends MultiMakerLeagueOptionDto>>, lk50<? extends List<? extends RegularMarketRule>>, qhw, v1b<? super Unit>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ qhw c;
    public final /* synthetic */ tjw d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qhw.values().length];
            try {
                qhw qhwVar = qhw.a;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjw(v1b v1bVar, tjw tjwVar) {
        super(4, v1bVar);
        this.d = tjwVar;
    }

    @Override // defpackage.iaj
    public final Object d(lk50<? extends List<? extends MultiMakerLeagueOptionDto>> lk50Var, lk50<? extends List<? extends RegularMarketRule>> lk50Var2, qhw qhwVar, v1b<? super Unit> v1bVar) {
        jjw jjwVar = new jjw(v1bVar, this.d);
        jjwVar.a = lk50Var;
        jjwVar.b = lk50Var2;
        jjwVar.c = qhwVar;
        return jjwVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        qhw qhwVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = a.a[qhwVar.ordinal()];
        final tjw tjwVar = this.d;
        int i2 = 1;
        if (i == 1) {
            if (lk50Var instanceof lk50.a) {
                ku90<com.sporty.android.common.uievent.a> ku90Var = tjwVar.e0;
                StringUiText stringUiText = vch0.a;
                b.e(ku90Var, new ResourceUiText(R.string.multi_maker__no_selections_found), null, new ResourceUiText(R.string.multi_maker__please_change_the_condition_of_filters), null, null, null, new x6d(tjwVar, i2), r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
                return Unit.a;
            }
            if (lk50Var2 instanceof lk50.a) {
                ku90<com.sporty.android.common.uievent.a> ku90Var2 = tjwVar.e0;
                StringUiText stringUiText2 = vch0.a;
                b.e(ku90Var2, null, null, new ResourceUiText(R.string.multi_maker__multi_maker_disabled), null, null, null, new Function1() { // from class: hjw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj2;
                        alertDialogCallbackType.getClass();
                        if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                            b.b(tjwVar.e0);
                        }
                        return Unit.a;
                    }
                }, 251);
            }
        } else if ((lk50Var instanceof lk50.a) || (lk50Var2 instanceof lk50.a)) {
            ku90<com.sporty.android.common.uievent.a> ku90Var3 = tjwVar.e0;
            StringUiText stringUiText3 = vch0.a;
            b.e(ku90Var3, null, null, new ResourceUiText(R.string.multi_maker__multi_maker_disabled), null, null, null, new ijw(tjwVar, 0), 251);
        }
        return Unit.a;
    }
}
