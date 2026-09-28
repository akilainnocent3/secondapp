package defpackage;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.firebase.messaging.RemoteMessage;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.profile.ProfileActivity;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class gsx implements ouc0 {
    public final uqm a;
    public final m2l b;
    public final psm c;
    public final AtomicInteger d;
    public final j1b e;

    public gsx(uqm uqmVar, m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, psm psmVar) {
        uqmVar.getClass();
        m2lVar.getClass();
        psmVar.getClass();
        this.a = uqmVar;
        this.b = m2lVar;
        this.c = psmVar;
        this.d = new AtomicInteger((int) System.currentTimeMillis());
        this.e = w5b.a(k5bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ouc0
    public final void a(Context context, ox0 ox0Var, RemoteMessage.a aVar, String str) {
        String str2;
        String str3;
        context.getClass();
        PendingIntent activity = null;
        if (hp0.A.y > 0) {
            ej5.c(this.e, null, null, new fsx(this, null), 3);
            return;
        }
        if (o0b.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                yo50.a();
                NotificationChannel notificationChannel = new NotificationChannel("nin_channel", "NIN", 4);
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            }
            String str4 = "";
            if ((aVar == null || (str2 = aVar.a) == null) && (str2 = (String) ox0Var.get("title")) == null) {
                str2 = "";
            }
            if (aVar == null || (str3 = aVar.b) == null) {
                String str5 = (String) ox0Var.get("description");
                if (str5 != null) {
                    str4 = str5;
                }
            } else {
                str4 = str3;
            }
            g1y g1yVar = new g1y(context, "nin_channel");
            g1yVar.w.icon = R.drawable.ic_notification;
            g1yVar.q = context.getColor(R.color.brand_primary);
            g1yVar.e = g1y.b(str2);
            g1yVar.f = g1y.b(str4);
            g1yVar.j = 1;
            uqm uqmVar = this.a;
            Account account = uqmVar.getAccount();
            if (account != null) {
                Intent intent = new Intent(context, (Class<?>) ProfileActivity.class);
                String phone = account.name;
                phone.getClass();
                if (this.c.r()) {
                    phone = uqmVar.getAccountInfo().getPhone();
                }
                intent.putExtra("account_number", phone);
                AccountInfo accountInfo = uqmVar.getAccountInfo();
                if (accountInfo != null) {
                    intent.putExtra("first_name", accountInfo.getFirstName());
                    intent.putExtra("last_name", accountInfo.getLastName());
                    intent.putExtra("email", accountInfo.getEmail());
                    intent.putExtra("date_of_birth", accountInfo.getBirthday());
                    intent.putExtra("user_name", accountInfo.getNickname());
                    intent.putExtra("avatar", accountInfo.getAvatar());
                    intent.putExtra("state", accountInfo.getState());
                    intent.putExtra("area", accountInfo.getArea());
                    intent.putExtra("editableLastName", accountInfo.getEditableBirthday());
                    intent.putExtra("editableFirstName", accountInfo.getEditableFirstName());
                    intent.putExtra("editableFirstName", accountInfo.getEditableLastName());
                }
                activity = PendingIntent.getActivity(context, 999, intent, 201326592);
            }
            g1yVar.g = activity;
            new t2y(context).a(this.d.incrementAndGet(), g1yVar.a());
        }
    }
}
