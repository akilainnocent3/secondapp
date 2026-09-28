package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ww7 extends RecyclerView.f<zw7> implements kz1 {
    public final r320 a;
    public final r320 b;
    public final ArrayList<BookingCodeInfoDto> c = new ArrayList<>();
    public boolean d;
    public int e;

    public ww7(r320 r320Var, r320 r320Var2) {
        this.a = r320Var;
        this.b = r320Var2;
    }

    @Override // defpackage.kz1
    public final void c(int i, List list, boolean z) {
        list.getClass();
        ArrayList<BookingCodeInfoDto> arrayList = this.c;
        arrayList.clear();
        arrayList.addAll(list);
        this.d = z;
        this.e = i;
        notifyDataSetChanged();
    }

    @Override // defpackage.kz1
    public final void f() {
        ArrayList<BookingCodeInfoDto> arrayList = this.c;
        int size = arrayList.size();
        arrayList.clear();
        notifyItemRangeRemoved(0, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // defpackage.kz1
    public final void h(int i, List list, boolean z) {
        list.getClass();
        ArrayList<BookingCodeInfoDto> arrayList = this.c;
        int size = arrayList.size();
        arrayList.addAll(list);
        this.d = z;
        this.e = i;
        notifyItemRangeInserted(size, list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        zw7 zw7Var = (zw7) d0Var;
        zw7Var.getClass();
        BookingCodeInfoDto bookingCodeInfoDto = this.c.get(i);
        bookingCodeInfoDto.getClass();
        zw7Var.d(bookingCodeInfoDto, i, this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new zw7(d2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), this.a, this.b);
    }
}
