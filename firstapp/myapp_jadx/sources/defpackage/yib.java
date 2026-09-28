package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yib implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e activity = ((zqy) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            case 1:
                urr urrVar = (urr) ((x5a0) ((biu) obj).P).getValue();
                return new gly(urrVar != null ? urrVar.i0(0L) : 9205357640488583168L);
            default:
                ((Function1) obj).invoke(b.a.C0321b.a);
                return Unit.a;
        }
    }
}
