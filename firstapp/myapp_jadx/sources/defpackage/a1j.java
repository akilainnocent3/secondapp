package defpackage;

import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a1j implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ n2j b;
    public final /* synthetic */ String c;

    public /* synthetic */ a1j(boolean z, n2j n2jVar, String str) {
        this.a = z;
        this.b = n2jVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n2j n2jVar = this.b;
        djh djhVar = n2jVar.b;
        boolean z = this.a;
        String str = this.c;
        if (z) {
            if (djhVar != null) {
                djhVar.B.setErrorText(str);
            }
        } else if (djhVar != null) {
            djhVar.B.setWarningText(str);
        }
        djh djhVar2 = n2jVar.b;
        if (djhVar2 != null) {
            djhVar2.B.setVisibility(0);
        }
        djh djhVar3 = n2jVar.b;
        if (djhVar3 != null) {
            djhVar3.B.startAnimation(AnimationUtils.loadAnimation(n2jVar.getActivity(), R.anim.fade_in_fade_out_toast));
        }
        return Unit.a;
    }
}
