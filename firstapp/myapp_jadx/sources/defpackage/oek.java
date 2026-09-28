package defpackage;

import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.domain.usecase.GetStoriesUseCase$invoke$1", f = "GetStoriesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oek extends tje0 implements gaj<List<? extends Story>, Story, v1b<? super List<? extends Story>>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ Story b;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((Story) t).getSortOrder()).compareTo(Integer.valueOf(((Story) t2).getSortOrder()));
        }
    }

    @Override // defpackage.gaj
    public final Object invoke(List<? extends Story> list, Story story, v1b<? super List<? extends Story>> v1bVar) {
        oek oekVar = new oek(3, v1bVar);
        oekVar.a = list;
        oekVar.b = story;
        return oekVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Iterable iterableI0 = this.a;
        Story story = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (story != null) {
            iterableI0 = CollectionsKt.i0(iterableI0, kotlin.collections.a.c(story));
        }
        return CollectionsKt.r0(iterableI0, new a());
    }
}
