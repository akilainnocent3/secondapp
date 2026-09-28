package defpackage;

import com.appsflyer.internal.p;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o800 {
    public final UiText a;
    public final b b;
    public final TypeData c;

    public static final class a {
        public final UiText a;
        public final ChannelData b;
        public final boolean c;

        public a(UiText uiText, ChannelData channelData, boolean z) {
            this.a = uiText;
            this.b = channelData;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InnerTabUiState(tabName=");
            sb.append(this.a);
            sb.append(", channelData=");
            sb.append(this.b);
            sb.append(", isToolTipIconVisible=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class b {
        public final List<a> a;

        public b(List list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() * 31;
        }

        public final String toString() {
            return p.a("InnerTabsHolderUiState(tabs=", ", startWithPosition=null)", this.a);
        }
    }

    public o800(UiText uiText, b bVar, TypeData typeData) {
        this.a = uiText;
        this.b = bVar;
        this.c = typeData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o800)) {
            return false;
        }
        o800 o800Var = (o800) obj;
        return this.a.equals(o800Var.a) && this.b.equals(o800Var.b) && this.c.equals(o800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PaymentProviderTabUiState(tabName=" + this.a + ", innerTabs=" + this.b + ", typeData=" + this.c + ")";
    }
}
