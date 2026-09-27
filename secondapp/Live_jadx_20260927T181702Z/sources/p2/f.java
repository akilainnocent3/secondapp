package p2;

import android.widget.AutoCompleteTextView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@y0({y0.a.LIBRARY})
public class f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements AutoCompleteTextView.Validator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f120331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f120332b;

        public a(c cVar, b bVar) {
            this.f120331a = cVar;
            this.f120332b = bVar;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f120332b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f120331a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, e.a aVar, e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new e.b(aVar, cVar, null));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}
