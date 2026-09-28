package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.patron.KYCTierStatus;
import com.sportybet.android.user.kyc.KYCActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class cip extends RecyclerView.d0 {
    public final esp a;
    public final Context b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KYCTierStatus.values().length];
            try {
                iArr[KYCTierStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KYCTierStatus.UNDER_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KYCTierStatus.VERIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KYCTierStatus.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KYCTierStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cip(esp espVar) {
        ConstraintLayout constraintLayout = espVar.a;
        super(constraintLayout);
        this.a = espVar;
        this.b = constraintLayout.getContext();
        espVar.b.setOnClickListener(new View.OnClickListener() { // from class: bip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yrh0.t(this.a.b, KYCActivity.class, true);
            }
        });
    }
}
