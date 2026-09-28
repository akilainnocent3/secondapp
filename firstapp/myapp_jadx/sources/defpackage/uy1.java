package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.sportygames.commons.SportyGamesManager;
import defpackage.g6i0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1;", "Lg6i0;", "B", "Lfq0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class uy1<B extends g6i0> extends fq0 {
    public static final /* synthetic */ int b = 0;
    public B a;

    public static double v1(Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return memoryInfo.totalMem / 1.073741824E9d;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public boolean onBackPressedCompat() {
        return false;
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        View root;
        super.onCreate(bundle);
        B b2 = (B) w1();
        this.a = b2;
        if (b2 != null && (root = b2.getRoot()) != null) {
            setContentView(root);
        }
        if (!x1()) {
            getOnBackPressedDispatcher().a(this, new sy1(this));
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.sportybet.android.game.REOPEN_GAME_LOBBY");
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        finish();
    }

    public final void u1() {
        if (x1()) {
            Intent intent = new Intent();
            intent.setAction("com.sportybet.android.game.REOPEN_GAME_LOBBY");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
            finish();
        }
    }

    public abstract B w1();

    public final boolean x1() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        return (sportyGamesManager != null ? sportyGamesManager.getBridge() : null) == null;
    }

    public final void y1() {
        b bVarCreate = new b.a(this).create();
        bVarCreate.getClass();
        bVarCreate.setTitle("Error");
        AlertController alertController = bVarCreate.f;
        alertController.e = "Check your internet connection and try again.";
        TextView textView = alertController.w;
        if (textView != null) {
            textView.setText("Check your internet connection and try again.");
        }
        alertController.c(-1, "OK", new DialogInterface.OnClickListener() { // from class: iy1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = uy1.b;
                this.a.finish();
            }
        });
        bVarCreate.show();
    }
}
