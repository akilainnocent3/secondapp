package defpackage;

import android.app.Activity;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.winning.WinningDialogActivity;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ejp implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ejp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = gjp.r0;
                ((gjp) obj2).C.setEnabled(((rr00) obj) instanceof rr00.b);
                break;
            default:
                WinningDialogActivity winningDialogActivity = (WinningDialogActivity) obj2;
                r190 r190Var = (r190) obj;
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                if (r190Var instanceof r190.c) {
                    winningDialogActivity.c0 = ((r190.c) r190Var).a;
                } else if (r190Var instanceof r190.a) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_SHOW_OFF_PREVIEW);
                    aVar.a("state = loading", new Object[0]);
                }
                break;
        }
    }
}
