package defpackage;

import com.sporty.android.platform.features.kyc.domain.uploadfile.KycFileSubmissionBottomSheetActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ztl extends py1 {
    public boolean a = false;

    public ztl() {
        addOnContextAvailableListener(new ytl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tsp) generatedComponent()).d0((KycFileSubmissionBottomSheetActivity) this);
    }
}
