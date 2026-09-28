package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class wz30 extends a {
    public final /* synthetic */ RangeDateSelector A;
    public final /* synthetic */ TextInputLayout w;
    public final /* synthetic */ TextInputLayout y;
    public final /* synthetic */ lcv.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz30(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, lcv.a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.A = rangeDateSelector;
        this.w = textInputLayout2;
        this.y = textInputLayout3;
        this.z = aVar;
    }

    @Override // com.google.android.material.datepicker.a
    public final void a() {
        RangeDateSelector rangeDateSelector = this.A;
        rangeDateSelector.d = null;
        rangeDateSelector.a(this.w, this.y, this.z);
    }

    @Override // com.google.android.material.datepicker.a
    public final void b(Long l) {
        RangeDateSelector rangeDateSelector = this.A;
        rangeDateSelector.d = l;
        rangeDateSelector.a(this.w, this.y, this.z);
    }
}
