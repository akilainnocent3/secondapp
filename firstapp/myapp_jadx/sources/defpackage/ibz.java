package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;

/* JADX INFO: loaded from: classes7.dex */
public final class ibz implements g6i0 {
    public final SearchMarketView a;
    public final TextView b;
    public final AppCompatEditText c;
    public final TextView d;

    public ibz(SearchMarketView searchMarketView, TextView textView, AppCompatEditText appCompatEditText, TextView textView2) {
        this.a = searchMarketView;
        this.b = textView;
        this.c = appCompatEditText;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
