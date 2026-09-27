package p2;

import android.widget.SeekBar;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:progress", type = SeekBar.class)})
@y0({y0.a.LIBRARY})
public class y {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f120381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f120383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f120384d;

        public a(b bVar, androidx.databinding.o oVar, c cVar, d dVar) {
            this.f120381a = bVar;
            this.f120382b = oVar;
            this.f120383c = cVar;
            this.f120384d = dVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            b bVar = this.f120381a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i10, z10);
            }
            androidx.databinding.o oVar = this.f120382b;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f120383c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f120384d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void onProgressChanged(SeekBar seekBar, int i10, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, oVar, cVar, dVar));
        }
    }

    @androidx.databinding.d({"android:progress"})
    public static void b(SeekBar seekBar, int i10) {
        if (i10 != seekBar.getProgress()) {
            seekBar.setProgress(i10);
        }
    }
}
