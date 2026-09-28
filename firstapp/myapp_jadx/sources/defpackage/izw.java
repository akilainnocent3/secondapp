package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class izw {
    public static final xxw a = new xxw();

    public static boolean a() {
        return a.a().f();
    }

    public static void b(String str) {
        hp0 hp0Var = hp0.A;
        Intent intent = new Intent(hp0Var, (Class<?>) PreMatchMyFavoriteActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        intent.setFlags(268435456);
        hp0Var.startActivity(intent);
    }

    public static void c(String str) {
        hp0 hp0Var = hp0.A;
        Intent intent = new Intent(hp0Var, (Class<?>) MyFavoriteSummaryActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        intent.setFlags(268435456);
        hp0Var.startActivity(intent);
    }
}
