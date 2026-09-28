package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.platform.features.loyalty.unlockedbottomsheet.LoyaltyUnlockedActivity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class m1u extends vd<Unit, a> {

    public static abstract class a {

        /* JADX INFO: renamed from: m1u$a$a, reason: collision with other inner class name */
        public static final class C0852a extends a {
            public static final C0852a a = new C0852a();
        }

        public static final class b extends a {
            public static final b a = new b();
        }
    }

    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        ((Unit) obj).getClass();
        return new Intent(context, (Class<?>) LoyaltyUnlockedActivity.class);
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i != 0) {
            return i != 1 ? a.C0852a.a : a.b.a;
        }
        return a.C0852a.a;
    }
}
