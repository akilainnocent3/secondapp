package defpackage;

import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.MyLog;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr02;", "Lyq0;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class r02 extends yq0 {
    @Override // androidx.fragment.app.d
    public final void show(FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(e);
        }
    }
}
