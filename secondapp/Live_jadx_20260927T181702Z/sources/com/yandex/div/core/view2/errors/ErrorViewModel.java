package com.yandex.div.core.view2.errors;

import com.yandex.div.R;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorViewModel {
    private final int errorCount;

    @l
    private final String errorDetails;
    private final boolean showDetails;
    private final int warningCount;

    @l
    private final String warningDetails;

    public ErrorViewModel() {
        this(false, 0, 0, null, null, 31, null);
    }

    private final int component2() {
        return this.errorCount;
    }

    private final int component3() {
        return this.warningCount;
    }

    private final String component4() {
        return this.errorDetails;
    }

    private final String component5() {
        return this.warningDetails;
    }

    public static /* synthetic */ ErrorViewModel copy$default(ErrorViewModel errorViewModel, boolean z10, int i10, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = errorViewModel.showDetails;
        }
        if ((i12 & 2) != 0) {
            i10 = errorViewModel.errorCount;
        }
        if ((i12 & 4) != 0) {
            i11 = errorViewModel.warningCount;
        }
        if ((i12 & 8) != 0) {
            str = errorViewModel.errorDetails;
        }
        if ((i12 & 16) != 0) {
            str2 = errorViewModel.warningDetails;
        }
        String str3 = str2;
        int i13 = i11;
        return errorViewModel.copy(z10, i10, i13, str, str3);
    }

    public final boolean component1() {
        return this.showDetails;
    }

    @l
    public final ErrorViewModel copy(boolean z10, int i10, int i11, @l String str, @l String str2) {
        return new ErrorViewModel(z10, i10, i11, str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return this.showDetails == errorViewModel.showDetails && this.errorCount == errorViewModel.errorCount && this.warningCount == errorViewModel.warningCount && m0.g(this.errorDetails, errorViewModel.errorDetails) && m0.g(this.warningDetails, errorViewModel.warningDetails);
    }

    public final int getCounterBackground() {
        int i10 = this.warningCount;
        if (i10 > 0 && this.errorCount > 0) {
            return R.drawable.warning_error_counter_background;
        }
        if (i10 == 0 && this.errorCount == 0) {
            return R.drawable.neutral_counter_background;
        }
        return i10 > 0 ? R.drawable.warning_counter_background : R.drawable.error_counter_background;
    }

    @l
    public final String getCounterText() {
        int i10 = this.errorCount;
        if (i10 <= 0 || this.warningCount <= 0) {
            int i11 = this.warningCount;
            if (i11 > 0) {
                return String.valueOf(i11);
            }
            return i10 > 0 ? String.valueOf(i10) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.errorCount);
        sb2.append('/');
        sb2.append(this.warningCount);
        return sb2.toString();
    }

    @l
    public final String getDetails() {
        if (this.errorCount <= 0 || this.warningCount <= 0) {
            return this.warningCount > 0 ? this.warningDetails : this.errorDetails;
        }
        return this.errorDetails + "\n\n" + this.warningDetails;
    }

    public final boolean getShowDetails() {
        return this.showDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.showDetails;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (((((((r10 * 31) + this.errorCount) * 31) + this.warningCount) * 31) + this.errorDetails.hashCode()) * 31) + this.warningDetails.hashCode();
    }

    @l
    public String toString() {
        return "ErrorViewModel(showDetails=" + this.showDetails + ", errorCount=" + this.errorCount + ", warningCount=" + this.warningCount + ", errorDetails=" + this.errorDetails + ", warningDetails=" + this.warningDetails + ')';
    }

    public ErrorViewModel(boolean z10, int i10, int i11, @l String str, @l String str2) {
        this.showDetails = z10;
        this.errorCount = i10;
        this.warningCount = i11;
        this.errorDetails = str;
        this.warningDetails = str2;
    }

    public /* synthetic */ ErrorViewModel(boolean z10, int i10, int i11, String str, String str2, int i12, x xVar) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? "" : str2);
    }
}
