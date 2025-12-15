BASE_DIR := leetcode/java

DIRS := \
	arrays \
	strings \
	hashmap \
	two_pointers \
	sliding_window \
	stack \
	queue \
	linked_list \
	tree \
	binary_search \
	dfs \
	bfs \
	dynamic_programming \
	greedy \
	backtracking \
	graph

.PHONY: dirs clean

dirs:
	@mkdir -p $(addprefix $(BASE_DIR)/,$(DIRS))
	@echo "LeetCode directories created ✔"

clean:
	@rm -rf leetcode
	@echo "LeetCode directories removed ✖"
