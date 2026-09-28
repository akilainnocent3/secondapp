package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class bu90 extends a {
    public final /* synthetic */ lcv.a w;
    public final /* synthetic */ TextInputLayout y;
    public final /* synthetic */ SingleDateSelector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu90(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, lcv.a aVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.z = singleDateSelector;
        this.w = aVar;
        this.y = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.a
    public final void a() {
        this.y.getError();
        this.w.a();
    }

    @Override // com.google.android.material.datepicker.a
    public final void b(Long l) {
        SingleDateSelector singleDateSelector = this.z;
        if (l == null) {
            l = null;
            singleDateSelector.a = null;
        } else {
            singleDateSelector.a = l;
        }
        this.w.b(l);
    }
}
