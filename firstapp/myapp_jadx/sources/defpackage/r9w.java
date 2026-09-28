package defpackage;

import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class r9w implements u9w {
    public final EmailChangeFlowArgs a;

    static {
        EmailChangeFlowArgs.Companion companion = EmailChangeFlowArgs.INSTANCE;
    }

    public r9w(EmailChangeFlowArgs emailChangeFlowArgs) {
        this.a = emailChangeFlowArgs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9w) && this.a.equals(((r9w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToEmailChangeFlow(args=" + this.a + ")";
    }
}
