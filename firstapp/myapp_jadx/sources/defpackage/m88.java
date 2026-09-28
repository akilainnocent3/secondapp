package defpackage;

import android.os.Parcelable;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m88 extends u88 {
    public final CommentsData c;

    static {
        Parcelable.Creator<CommentsData> creator = CommentsData.CREATOR;
    }

    public m88(CommentsData commentsData) {
        commentsData.getClass();
        this.c = commentsData;
    }

    @Override // defpackage.u88
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m88) && Intrinsics.g(this.c, ((m88) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Comment(commentsData=" + this.c + ")";
    }
}
