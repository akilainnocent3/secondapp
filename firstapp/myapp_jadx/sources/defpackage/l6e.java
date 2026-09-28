package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l6e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(w3e.d.a);
                break;
            default:
                final n2j n2jVar = (n2j) obj;
                if (n2jVar.isAdded()) {
                    e activity = n2jVar.getActivity();
                    if (activity != null) {
                        r4j r4jVar = r4j.e;
                        n2jVar.v0();
                        jcg.d(r4jVar, activity, "Fruit Hunt", new ResultWrapper.GenericError(80001, new HTTPResponse(9005, n2jVar.getString(R.string.game_not_available), null, null, null, null, null, 64, null)), new g2j(activity, 0), new h2j(), null, 0, activity.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: i2j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                String str = (String) obj2;
                                str.getClass();
                                n2jVar.q0(str);
                                return Unit.a;
                            }
                        }, null, 97728);
                    }
                    n2jVar.X0(false);
                }
                break;
        }
        return Unit.a;
    }
}
