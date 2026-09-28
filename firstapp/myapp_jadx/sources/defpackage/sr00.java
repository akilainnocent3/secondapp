package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sr00 {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends sr00 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("BlockingErrorDialog(message=", this.a, LxHElgWAiSeM.zbqnnXg);
        }
    }

    public static final class b extends sr00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1091776728;
        }

        public final String toString() {
            return "NoAction";
        }
    }

    public static final class c extends sr00 {
        public final ChannelAsset.Channel a;

        public c(ChannelAsset.Channel channel) {
            this.a = channel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            ChannelAsset.Channel channel = this.a;
            if (channel == null) {
                return 0;
            }
            return channel.hashCode();
        }

        public final String toString() {
            return "Success(channel=" + this.a + ")";
        }
    }
}
