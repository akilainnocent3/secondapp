package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class vw7 extends RecyclerView.f<a> {
    public final ArrayList<BookingCodeInfoOutcomeDto> a = new ArrayList<>();

    public final class a extends RecyclerView.d0 {
        public final h2p a;

        public a(h2p h2pVar) {
            super(h2pVar.a);
            this.a = h2pVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = this.a.get(i);
        bookingCodeInfoOutcomeDto.getClass();
        BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto2 = bookingCodeInfoOutcomeDto;
        TextView textView = aVar.a.b;
        j7g j7gVar = new j7g();
        String outcomeDescription = bookingCodeInfoOutcomeDto2.getOutcomeDescription();
        if (outcomeDescription == null) {
            outcomeDescription = "";
        }
        j7gVar.d(outcomeDescription, true);
        j7gVar.a("  ");
        String marketDescription = bookingCodeInfoOutcomeDto2.getMarketDescription();
        j7gVar.a(marketDescription != null ? marketDescription : "");
        textView.setText(j7gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(h2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
