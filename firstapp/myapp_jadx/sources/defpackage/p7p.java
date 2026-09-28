package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertController;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p7p extends ptl {
    public psm b;
    public bnh0 c;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            p7p p7pVar = p7p.this;
            dialogInterface.dismiss();
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(bnh0.g(p7pVar.c.a.b().d, new String[]{"/common/config/latestDownload/android"})));
                intent.setFlags(268435456);
                Intent intentB = ui8.b(p7pVar, intent, p7pVar.getCMSString(R.string.app_common__please_choose_a_browser_to_open, new Object[0]));
                if (intentB != null) {
                    yrh0.s(p7pVar, intentB, true);
                } else {
                    zyf0.a(R.string.app_common__unable_to_find_application_to_perform_this_action);
                }
            } catch (Exception unused) {
                zyf0.a(R.string.app_common__unable_to_find_application_to_perform_this_action);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            p7p.this.finish();
        }
    }

    @Override // defpackage.r1k
    public boolean onBackPressedCompat() {
        if (!a8b.c().y()) {
            return false;
        }
        finish();
        return true;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (a8b.c().y()) {
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
            String str = this.b.n() ? "New version available. Press upgrade to win 10 million Jackpot right now!" : "Jackpot11 has upgraded to Jackpot12. Press upgrade to win 5 million KES now!";
            AlertController.b bVar = aVar.a;
            bVar.f = str;
            aVar.b("Later", new b());
            aVar.c("Upgrade", new a());
            bVar.k = false;
            aVar.create().show();
        }
    }
}
