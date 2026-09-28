package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeActivity", f = "CustomCodeActivity.kt", l = {133}, m = "onCodeShare", v = 2)
public final class w6c extends x1b {
    public String a;
    public BookingData b;
    public String c;
    public ArrayList d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CustomCodeActivity i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6c(CustomCodeActivity customCodeActivity, x1b x1bVar) {
        super(x1bVar);
        this.i = customCodeActivity;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        int i = CustomCodeActivity.f;
        return this.i.z1(null, null, null, this);
    }
}
