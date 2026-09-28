package defpackage;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface uq50 {
    Task<ReviewInfo> a();

    Task<Void> b(Activity activity, ReviewInfo reviewInfo);
}
