package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n990 implements id90 {

    public static final class a extends n990 {
        public static final a a = new a();
        public static final ConcatUiText b = n990.a(R.string.page_payment__spei_info_dialog_nuvei_0, R.string.page_payment__spei_info_dialog_nuvei_1);

        @Override // defpackage.n990
        public final ConcatUiText b() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1026457604;
        }

        public final String toString() {
            return "SpeiByNuveiDeposit";
        }
    }

    public static final class b extends n990 {
        public static final b a = new b();
        public static final ConcatUiText b = n990.a(R.string.page_payment__spei_info_dialog_stp_0, R.string.page_payment__spei_info_dialog_stp_1);

        @Override // defpackage.n990
        public final ConcatUiText b() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1468180744;
        }

        public final String toString() {
            return "SpeiByStpDeposit";
        }
    }

    public static ConcatUiText a(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new ResourceUiText(i));
        }
        ResourceUiText[] resourceUiTextArr = (ResourceUiText[]) arrayList.toArray(new ResourceUiText[0]);
        return new ConcatUiText((UiText[]) Arrays.copyOf(resourceUiTextArr, resourceUiTextArr.length), new StringUiText("\n\n"));
    }

    public abstract ConcatUiText b();
}
