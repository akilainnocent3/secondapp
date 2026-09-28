package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes6.dex */
public final class tj5 {
    public static final /* synthetic */ int a = 0;

    public static final bag a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (bag) sj5.b(extras, "EXTRA_ENTRANCE", bag.class);
    }

    public static final bag b(Fragment fragment) {
        fragment.getClass();
        return a(fragment.requireActivity().getIntent());
    }

    public static final boolean c(Activity activity) {
        return a(activity.getIntent()) == dag.FOOTER_PAYMENT;
    }
}
