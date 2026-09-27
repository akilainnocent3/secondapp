package com.yandex.div.core.view2;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import dr.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.am;
import mq.e0;
import mq.q4;
import mq.sm;
import mq.tk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public class DivImagePreloader {

    @oy.l
    private final DivImageLoader imageLoader;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Callback {
        void finish(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class PreloadVisitor extends DivVisitor<w2> {

        @oy.l
        private final DivPreloader.DownloadCallback callback;

        @oy.l
        private final DivPreloader.PreloadFilter preloadFilter;

        @oy.l
        private final ArrayList<LoadReference> references;

        @oy.l
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

        public PreloadVisitor(@oy.l DivPreloader.DownloadCallback downloadCallback, @oy.l ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, boolean z10) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z10;
            this.references = new ArrayList<>();
        }

        private final void visitBackground(e0 e0Var, ExpressionResolver expressionResolver) {
            List<q4> background = e0Var.d().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (q4 q4Var : background) {
                    if ((q4Var instanceof q4.c) && this.preloadFilter.shouldPreloadBackground(q4Var, expressionResolver)) {
                        divImagePreloader.preloadImage(((q4.c) q4Var).e().f111233e.evaluate(expressionResolver).toString(), this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 defaultVisit(e0 e0Var, ExpressionResolver expressionResolver) {
            defaultVisit2(e0Var, expressionResolver);
            return w2.f79517a;
        }

        @oy.l
        public final List<LoadReference> preload(@oy.l e0 e0Var) {
            visit(e0Var, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(@oy.l e0 e0Var, @oy.l ExpressionResolver expressionResolver) {
            visitBackground(e0Var, expressionResolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.h hVar, ExpressionResolver expressionResolver) {
            visit2(hVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.k kVar, ExpressionResolver expressionResolver) {
            visit2(kVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.o oVar, ExpressionResolver expressionResolver) {
            visit2(oVar, expressionResolver);
            return w2.f79517a;
        }

        public /* synthetic */ PreloadVisitor(DivImagePreloader divImagePreloader, DivPreloader.DownloadCallback downloadCallback, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, boolean z10, int i10, kotlin.jvm.internal.x xVar) {
            this(downloadCallback, expressionResolver, preloadFilter, (i10 & 8) != 0 ? true : z10);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return w2.f79517a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ w2 visit(e0.r rVar, ExpressionResolver expressionResolver) {
            visit2(rVar, expressionResolver);
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.r rVar, @oy.l ExpressionResolver expressionResolver) {
            List<sm.d> list;
            defaultVisit2((e0) rVar, expressionResolver);
            if (!this.preloadFilter.shouldPreloadContent(rVar, expressionResolver) || (list = rVar.e().F) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((sm.d) it.next()).f113412i.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.h hVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) hVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(hVar, expressionResolver)) {
                DivImagePreloader.this.preloadImage(hVar.e().B.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.f fVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) fVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(fVar, expressionResolver)) {
                DivImagePreloader.this.preloadImageBytes(fVar.e().f113941u.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.c cVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) cVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(cVar.e(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.g gVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) gVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(gVar.e()).iterator();
                while (it.hasNext()) {
                    visit((e0) it.next(), expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.e eVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) eVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(eVar.e(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.k kVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) kVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(kVar.e(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.q qVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) qVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = qVar.e().f108029q.iterator();
                while (it.hasNext()) {
                    visit(((am.c) it.next()).f108042a, expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@oy.l e0.o oVar, @oy.l ExpressionResolver expressionResolver) {
            defaultVisit2((e0) oVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = oVar.e().I.iterator();
                while (it.hasNext()) {
                    e0 e0Var = ((tk.c) it.next()).f113723c;
                    if (e0Var != null) {
                        visit(e0Var, expressionResolver);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Ticket {
        void cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class TicketImpl implements Ticket {

        @oy.l
        private final List<LoadReference> refs = new ArrayList();

        public final void addReference(@oy.l LoadReference loadReference) {
            this.refs.add(loadReference);
        }

        @Override // com.yandex.div.core.view2.DivImagePreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((LoadReference) it.next()).cancel();
            }
        }

        @oy.l
        public final List<LoadReference> getRefs() {
            return this.refs;
        }
    }

    @cr.a
    public DivImagePreloader(@oy.l DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    public static /* synthetic */ List preloadImage$default(DivImagePreloader divImagePreloader, e0 e0Var, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, DivPreloader.DownloadCallback downloadCallback, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadImage");
        }
        if ((i10 & 4) != 0) {
            preloadFilter = DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER;
        }
        return divImagePreloader.preloadImage(e0Var, expressionResolver, preloadFilter, downloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImageBytes(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    @oy.l
    public Ticket asTicket$div_release(@oy.l List<? extends LoadReference> list) {
        TicketImpl ticketImpl = new TicketImpl();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ticketImpl.addReference((LoadReference) it.next());
        }
        return ticketImpl;
    }

    @oy.l
    public List<LoadReference> preloadImage(@oy.l e0 e0Var, @oy.l ExpressionResolver expressionResolver, @oy.l DivPreloader.PreloadFilter preloadFilter, @oy.l DivPreloader.DownloadCallback downloadCallback) {
        return new PreloadVisitor(downloadCallback, expressionResolver, preloadFilter, false).preload(e0Var);
    }

    @oy.l
    public DivPreloader.Callback toPreloadCallback(@oy.l final Callback callback) {
        return new DivPreloader.Callback() { // from class: com.yandex.div.core.view2.c
            @Override // com.yandex.div.core.DivPreloader.Callback
            public final void finish(boolean z10) {
                callback.finish(z10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImage(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }
}
