package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class y0g implements rdd {
    public final /* synthetic */ s9s a;

    public y0g(EmojiCompatInitializer emojiCompatInitializer, s9s s9sVar) {
        this.a = s9sVar;
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        (Build.VERSION.SDK_INT >= 28 ? yna.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.a.d(this);
    }
}
