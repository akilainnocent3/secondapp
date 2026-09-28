package defpackage;

import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.B.setCampaignCompletedText();
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    djhVar2.B.setVisibility(0);
                }
                djh djhVar3 = u6jVar.b;
                if (djhVar3 != null) {
                    djhVar3.B.startAnimation(AnimationUtils.loadAnimation(u6jVar.getActivity(), R.anim.fade_in_fade_out_toast));
                }
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
