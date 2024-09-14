<section class="discussion">
    <h3>Discussion on Lecture</h3>

    <form method="post" action="postCommentController">
        <input type="hidden" name="lectureId" value="<%= lectureId %>">
        <input type="text" name="userName" placeholder="Your Name" required>
        <textarea name="comment" placeholder="Your Comment" required></textarea>
        <button type="submit">Post Comment</button>
    </form>

    <div class="comments">
        <!-- Display comments here -->
        <div class="comment">
            <p><strong>John:</strong> This is a great lecture!</p>
            <div class="nested-comment">
                <p><strong>Instructor:</strong> Thank you, John!</p>
            </div>
        </div>
    </div>
</section>

