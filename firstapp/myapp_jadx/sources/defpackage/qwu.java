package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qwu implements Function0 {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ qwu() {
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = MatchEventActivity.a0;
                return new LinearLayoutManager();
            default:
                return Unit.a;
        }
    }

    public /* synthetic */ qwu(MatchEventActivity matchEventActivity) {
    }
}
